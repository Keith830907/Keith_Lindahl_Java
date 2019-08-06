using System;


namespace Branching
{
    class Employee
    {
        //Software developer name
        public string Developer_Name { set; get; }

        // Get Adress
        public string Developer_Address { set; get; }

        //Gross monthly pay
        public double Gross_Monthly_Pay { set; get; }

        //Annual gross pay
        public double Gross_Annual_Pay { set; get; }

        //Employee type: W2/1099
        public string Employee_Type { set; get; }

        //Monthly and annual taxes determined by employee type
        public double Monthly_Tax { set; get; }
        public double Annual_Tax { set; get; }

        public const int Tax_Percentage = 7;

        public void EnterDeveloperName()
        {

            Console.Write("Please enter the name of the developer: ");
            string name = Console.ReadLine();
            Developer_Name = name;

        }

        public void EnterAddress()
        {
           
            
                Console.Write("Please enter the Address of the developer: ");
                string address = Console.ReadLine();
                Developer_Address = address;
        }

        public void EnterGrossMonthlyPay()
        {
           
                Console.Write("Please enter the gross monthly pay: ");
                string grossmonthlypay = Console.ReadLine();
                Gross_Monthly_Pay = Convert.ToDouble(grossmonthlypay);
              
        }

        public void CalculateGrossAnnualPay()
        {
            Gross_Annual_Pay = Gross_Monthly_Pay * 12;
        }

        public void EnterEmployeeType()
        {
            bool success = false;
            while (!success)
            {
                Console.Write("Enter employee type(taxed enter w2 : not taxed enter 1099):");
                string Emp_Type = Console.ReadLine();
                if (string.IsNullOrEmpty(Emp_Type))
                    Console.WriteLine("Employee type cannot be empty");
                else if (Emp_Type == "w2" || Emp_Type == "W2")
                {
                    success = true;
                    Employee_Type = "W2";
                }
                else if (Emp_Type == "1099")
                {
                    success = true;
                    Employee_Type = "1099";
                }
                else
                    Console.WriteLine(Emp_Type + " is invalid, Enter W2 or 1099");
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
