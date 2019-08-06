using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AddingVariables
{
    using System;

    class Program
    {
        static void Main()
        {
           
            
            Console.Write("------ Week Two Adding Variables Assignment ------\n");
            Console.Write("***********************************************\n");
            Console.Write("------Please insert details as asked-----\n");
            Console.Write("***********************************************\n\n");
            Console.Write("Enter Software developer's name:");
            string dev_name = Console.ReadLine();//Get dev's anme and store it in variable
            Console.Write("Enter Software developer's address:");
            string dev_addr = Console.ReadLine();//Get dev's address and stor it in variable
            Console.Write("Enter Software developer's monthly gross pay:\n");
            double  dev_gross_pay = Convert.ToDouble(Console.ReadLine());//Get dev's monthly pay and store it in variable
            double total_taxes_per_month = dev_gross_pay * 0.07;//Get tax amount from dev's monthly pay
            Console.Write("\n******Software Developer Details******\n");

            Console.Write("Name: " + dev_name + "\n");//print dev's name to screen

            Console.Write("Address: " + dev_addr + "\n");//print dev's address to screen

            Console.Write("Monthly gross pay:$" + dev_gross_pay + "\n");//print dev's monthly pay to screen

            Console.Write(String.Format("{0:C}", total_taxes_per_month) + " in Taxes paid for this month" + "\n");//print the tax amount of monthly pay to screen

            Console.Write("Thank you for playing along\n");

            Console.Write("\nPress any key to exit...");
            Console.ReadKey(true);
            Console.Clear();
        }
    }
}