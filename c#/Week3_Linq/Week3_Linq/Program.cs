using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Week3_Linq
{
    
    class Employee
    {
        string FirstName;
        string LastName;
        string StreetAddress;
        string City;
        string State;
        string Zip;

        // constructor 
        public Employee(string firstName, string lastName, string streetAddress, string city, string state, string zip)
        {
            FirstName = firstName;
            LastName = lastName;
            StreetAddress = streetAddress;
            City = city;
            State = state;
            Zip = zip;
        }

        // Tostring method 
        public new string ToString()
        {
            string[] array1 = { FirstName, LastName, StreetAddress, City, State, Zip };
            return String.Join(", ", array1);
        }

        // return array of attributes
        public string[] GetRow()
        {
            string[] stringArray = { FirstName, LastName, StreetAddress, City, State, Zip };
            return stringArray;
        }
    }

    // Manager class, inherits Employee class
    class Manager : Employee
    {
        string CostCenter;
        string Supervisor;

        // Constructor 
        public Manager(string firstName, string lastName, string streetAddress, string city, string state, string zip, string costCenter, string supervisor)
        // base class constructor 
        : base(firstName, lastName, streetAddress, city, state, zip)
        {
            CostCenter = costCenter;
            Supervisor = supervisor;
        }

        // Tostring method to provide string representation of object
        public new string ToString()
        {
            string[] array1 = { "Manager", "NA", CostCenter, Supervisor, "NA" };
            return base.ToString() + String.Join(", ", array1);
        }

        // function to return array of attributes
        public new string[] GetRow()
        {
            string[] array1 = base.GetRow();   // we get the attributes from base class Employee
            string[] array2 = { "Manager", "NA", CostCenter, Supervisor, "NA" };

            // all attributes are concatenated
            string[] toreturn = array1.Concat(array2).ToArray();
            Console.WriteLine(toreturn[6]);
            return toreturn;
        }
    }

    class Developer : Employee
    {
        string DeveloperType;
        string Supervisor;
        string TaxType;

        // Constructor to initialise attributes
        public Developer(string firstName, string lastName, string streetAddress, string city, string state, string zip, string developerType, string supervisor, string taxType)
        // base class constructor call
        : base(firstName, lastName, streetAddress, city, state, zip)
        {
            DeveloperType = developerType;
            Supervisor = supervisor;
            TaxType = taxType;
        }

        // Tostring method to provide string representation of object
        public new string ToString()
        {
            string[] arr = { "Developer", DeveloperType, "0", Supervisor, TaxType };

            return base.ToString() + String.Join(", ", arr);
        }


        // function to return array of attributes
        public new string[] GetRow()
        {
            // we get the attributes from base class Employee
            string[] array1 = base.GetRow();
            string[] array2 = { "Developer", DeveloperType, "0", Supervisor, TaxType };

            // all attributes are concatenated
            string[] toreturn = array1.Concat(array2).ToArray();
            Console.WriteLine(toreturn[6]);
            return toreturn;
        }
    }

    static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new Form1());
        }
    }
}
