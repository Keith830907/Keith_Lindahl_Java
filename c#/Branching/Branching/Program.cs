using System;
using System.Globalization;
using System.Linq;


namespace Branching
{
    class Program
    {

        static void Main(string[] args)
        {
            CultureInfo cultureInfo = new CultureInfo("en-US");
            Employee[] employee = new Employee[3];
            Console.WriteLine("---------Welcome to Software Development Company---------");
            for (int i = 0; i < employee.Count(); i++)
            {
                Console.WriteLine();
                Console.WriteLine("------Enter software developer " + (i + 1) + " details-----");
                employee[i] = new Employee();
                employee[i].EnterDeveloperName();
                employee[i].EnterAddress();
                employee[i].EnterGrossMonthlyPay();
                employee[i].EnterEmployeeType();
                employee[i].CalculateGrossAnnualPay();
                employee[i].CalculatedTax();
            }
            while (true)
            {
                Console.WriteLine();
                Console.WriteLine("Display Employee Data -1-");
                Console.WriteLine("Exit -2-");
                Console.Write("Choose an option : ");
                string choice = Console.ReadLine();
                switch (choice)
                {
                    case "1":
                        for (int i = 0; i < employee.Count(); i++)
                        {
                            Console.WriteLine();
                            Console.WriteLine("------Software Developer " + (i + 1) + " Details-----");
                            Console.WriteLine("Developer Name: " + employee[i].Developer_Name);
                            Console.WriteLine("Address: " + employee[i].Developer_Address);
                            Console.WriteLine("Employee Type: " + employee[i].Employee_Type);
                            Console.WriteLine("Gross Monthly Pay: " + string.Format(cultureInfo, "{0:C}", employee[i].Gross_Monthly_Pay));
                            Console.WriteLine("Gross Annual Pay: " + string.Format(cultureInfo, "{0:C}", employee[i].Gross_Annual_Pay));
                            Console.WriteLine("Monthly Tax Amount: " + string.Format(cultureInfo, "{0:C}", employee[i].Monthly_Tax));
                            Console.WriteLine("Annual Tax Amount: " + string.Format(cultureInfo, "{0:C}", employee[i].Annual_Tax));
                        }
                        break;
                    case "2":
                        Environment.Exit(0);
                        break;
                    default:
                        Console.WriteLine(choice + " is invalid, Options are 1 or 2");
                        break;
                }
            }
        }
    }
}
