
using CsvHelper.Configuration.Attributes;
using System;
using System.Collections.Generic;
using System.IO;
using System.Text.RegularExpressions;

namespace Datastructures
{
    class Employee
    {
        //Software developer name
        [Index(0)]
        public string Developer_Name { set; get; }

        //Address
        [Index(1)]
        public string Developer_Address{ set; get; }

        //Gross monthly pay
        [Index(3)]
        public double Gross_Monthly_Pay { set; get; }

        //Annual gross pay
        [Index(4)]
        public double Gross_Annual_Pay { set; get; }

        //Employee type: W2/1099
        [Index(2)]
        public string Employee_Type { set; get; }

        //Monthly and annual taxes determined by employee type
        public double Monthly_Tax { set; get; }
        public double Annual_Tax { set; get; }
        public string Name { get; internal set; }

        public const int Tax_Percentage = 7;

        public void EnterDeveloperName()
        {
            bool success = false;
            while (!success)
            {
                Console.Write("Please enter the name: ");
                string name = Console.ReadLine();
                if (string.IsNullOrEmpty(name))
                    Console.WriteLine("Name cannot be empty");
                else if (Regex.Match(name, "[0-9]*[\\^$.|?*+()!@#%&]").Success || Regex.Match(name, "[0-9]").Success)
                    Console.WriteLine(name + " is invalid,Type only alphabets");
                else
                {
                    success = true;
                    Developer_Name = name;
                }

            }
        }

        public void EnterAddress()
        {
            bool passed = false;
            while (!passed)
            {
                Console.Write("Please enter the address of the developer: ");
                string address = Console.ReadLine();
                if (string.IsNullOrEmpty(address))
                    Console.WriteLine("Address cannot be empty");
                else if (Regex.Match(address, "[0-9]*[\\^$.|?*+()!@#%&]").Success || Regex.Match(address, "^[a-zA-Z0-9]+$").Success)
                    Console.WriteLine(address + " is invalid,Type only alphabet letters and numbers");
                else
                { 

                passed = true;
                Developer_Address = address;
                }

            }
        }

        public void EnterGrossMonthlyPay()
        {
            bool passed = false;
            while (!passed)
            {
                Console.Write("Please enter the gross monthly pay: ");
                string grossmonthlypay = Console.ReadLine();
                if (string.IsNullOrEmpty(grossmonthlypay))
                    Console.WriteLine("Gross monthly pay cannot be empty");
                else if (Regex.Match(grossmonthlypay, "[a-zA-Z]*[\\^$.|?*+()!@#%&]{5}").Success || Regex.Match(grossmonthlypay, "[a-zA-Z]").Success)
                {
                    Console.WriteLine(grossmonthlypay + " is invalid,Type only numbers");
                }
                else
                {
                    passed = true;
                    Gross_Monthly_Pay = Convert.ToDouble(grossmonthlypay);
                }

            }
        }

        public void CalculateGrossAnnualPay()
        {
            Gross_Annual_Pay = Gross_Monthly_Pay * 12;
        }

        public void EnterEmployeeType()
        {
            bool passed = false;
            while (!passed)
            {
                Console.Write("Enter employee type(w2 for taxed:1099 for untaxed):");
                string Employee_Type = Console.ReadLine();
                if (string.IsNullOrEmpty(Employee_Type))
                    Console.WriteLine("Employee type cannot be empty");
                else if (Employee_Type == "w2" || Employee_Type == "W2")
                {
                    passed = true;
                    this.Employee_Type = "W2";
                }
                else if (Employee_Type == "1099")
                {
                    passed = true;
                    this.Employee_Type = "1099";
                }
                else
                    Console.WriteLine(Employee_Type + " is invalid, Enter W2 or 1099");
            }
        }

        public void CalculatedTax()
        {
            if (Employee_Type == "1099")
            {
                Monthly_Tax = 0;
                Annual_Tax = 0;
            }
            else
            {
                Monthly_Tax = Gross_Monthly_Pay * Tax_Percentage / 100;
                Annual_Tax = Monthly_Tax * 12;
            }
        
        }
    }
}
