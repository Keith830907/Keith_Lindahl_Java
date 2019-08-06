using System;
using System.Collections.Generic;
using System.Linq;
using System.IO;

namespace DataStructures
{
    class Program
    {
        static void Main(string[] args)
        {
            Developer[] arr = new Developer[5];

            using (StreamReader reader = new StreamReader("C:\\Users\\keith\\source\\repos\\DataStructures\\DataStructures\\data.csv"))
            {
                int i = 0;

                while (true)
                {
                    string line = reader.ReadLine();
                    if (line == null)
                    {
                        break;
                    }
                    Developer obj = new Developer();
                    string[] tempArr;
                    tempArr = line.Split(',');
                    obj.Developer_Name = tempArr[0];
                    obj.Developer_Address = tempArr[1];
                    obj.Gross_Monthly_Pay = Convert.ToDouble(tempArr[2]);
                    obj.Annual_Gross_Pay = Convert.ToDouble(tempArr[3]);
                    obj.Employee_Type = Convert.ToDouble(tempArr[4]);
                   



                    arr[i] = obj;
                    i++;
                }
            }


            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine(arr[i].Developer_Name);
                Console.WriteLine(arr[i].Developer_Address);
                Console.WriteLine(arr[i].Gross_Monthly_Pay);  
                Console.WriteLine(arr[i].Annual_Gross_Pay);
                Console.WriteLine(arr[i].Employee_Type);
                

                Console.WriteLine("----------------------------------------------");
            }

            Console.ReadLine();

        }
    }

    struct Developer
    {
        public string Developer_Name;
        public string Developer_Address;
        public double Gross_Monthly_Pay;
        public double Annual_Gross_Pay;
        public double Employee_Type;
        

    }
}

