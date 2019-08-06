using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;


namespace CsvFile
{
    class Program
    {
        static void Main(string[] args)
        {

            //read the CSV file and convert it to a list 
            using (StreamReader reader = new StreamReader(@"C:\\Users\\keith\\source\\repos\\CsvFile\\CsvFile\\data.csv"))
            {
                List<string> listA = new List<string>();
                List<string> listB = new List<string>();
                List<string> listC = new List<string>();
                List<int> listD = new List<int>();
                //  List<int> listE = new List<int>();


                while (!reader.EndOfStream)
                {
                    var line = reader.ReadLine();
                    var values = line.Split(',');

                    listA.Add(values[0]);
                    listB.Add(values[1]);
                    listC.Add(values[2]);


                    listC.Select(double.Parse).ToList();
                }
                //convert string to int for calculations
                string[] arrayC = listC.ToArray();
                double[] myintc = new double[5];
                myintc = Array.ConvertAll(arrayC, double.Parse);
                //declaration of the rest of the arrays
                string[] arrayB = listB.ToArray();
                string[] arrayA = listA.ToArray();


                // print Developer Names
                Console.WriteLine("Names of Developers:");
                foreach (var element in listA)
                    Console.WriteLine(element);

                // print Addresses
                Console.WriteLine("Addresses of the Developers:");
                foreach (var element in listB)
                    Console.WriteLine(element);

                // print Monthly Gross Values
                Console.WriteLine("Monthly Gross Pay For All Developers:");
                foreach (var element in myintc)
                    Console.WriteLine(element);

                //Calculate and Display Annual Net Pay which is 93% of annual gross pay
                Console.WriteLine("Annual Net Pay For Developers:");
                foreach (double value in myintc)
                {
                    Console.WriteLine(0.93 * 12 * value);

                }






            }
            //wait for user to press the enter key
            Console.ReadLine();


        }


    }
}

