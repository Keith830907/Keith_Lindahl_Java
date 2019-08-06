using System;
using System.IO;

namespace Data
{
    class Program
    {
        static void Main(string[] args)
        {
            Developer[] arr = new Developer[5];

            using (StreamReader reader = new StreamReader("C:\\Users\\keith\\source\\repos\\Data\\Data\\data.csv"))
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
                    string[] Arr;
                    Arr = line.Split(',');
                    obj.Developer_Name = Arr[0];
                    obj.Developer_Address = Arr[1];
                    obj.Monthly_Pay = Convert.ToDouble(Arr[2]);
                    obj.Monthly_Tax = Convert.ToDouble(Arr[3]);
                    obj.Annual_Gross_Pay = Convert.ToDouble(Arr[4]);
                    obj.Annual_Tax = Convert.ToDouble(Arr[5]);
                    obj.Net_Pay = Convert.ToDouble(Arr[6]);



                    arr[i] = obj;
                    i++;
                }
            }


            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine(arr[i].Developer_Name);
                Console.WriteLine(arr[i].Developer_Address);
                Console.WriteLine(arr[i].Monthly_Pay);
                Console.WriteLine(arr[i].Monthly_Tax);
                Console.WriteLine(arr[i].Annual_Gross_Pay);
                Console.WriteLine(arr[i].Annual_Tax);
                Console.WriteLine(arr[i].Net_Pay);

                Console.WriteLine("*****************************************");
            }

            Console.ReadLine();

        }
    }

    struct Developer
    {
        public string Developer_Name;
        public string Developer_Address;
        public double Monthly_Pay;
        public double Monthly_Tax;
        public double Annual_Gross_Pay;
        public double Annual_Tax;
        public double Net_Pay;

    }
}