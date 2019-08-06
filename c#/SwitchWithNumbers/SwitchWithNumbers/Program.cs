using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SwitchWithNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter a Number between one and a Hundred: ");
            int i = Convert.ToInt32(Console.ReadLine());

            switch (i)
            {
                case int n when (n < 50 && n >= 25):
                    Console.WriteLine($"Balance is critically low: {n}");
                    break;

                case int n when (n < 100 && n >= 50):
                    Console.WriteLine($"Balance is low: {n}");
                    break;

                case int n when (n < 25):
                    Console.WriteLine($"Please call the bank: {n}");
                    break;
            }
            Console.ReadKey(true);
            Console.Clear();
        }
    }
}
