using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Week2DemoApp
{
    // class to implement Employee
    class Employee
    {
        string FirstName;
        string LastName;
        string StreetAddress;
        string City;
        string State;
        string Zip;

        // constructor that takes attributes as arguments and initializes them
        public Employee(string firstName, string lastName, string streetAddress, string city, string state, string zip)
        {
            FirstName = firstName;
            LastName = lastName;
            StreetAddress = streetAddress;
            City = city;
            State = state;
            Zip = zip;
        }

        // Tostring method to provide string representation of object
        public string ToString()
        {
            string[] arr = { FirstName, LastName, StreetAddress, City, State, Zip };
            return String.Join(", ", arr);
        }

        // function to return array of attributes
        public string[] GetRow()
        {
            string[] array = { FirstName, LastName, StreetAddress, City, State, Zip };
            return array;
        }
    }

    // Manager class, inherits Employee
    class Manager : Employee
    {
        string CostCenter;
        string Supervisor;

        // Constructor to initialise attributes
        public Manager(string firstName, string lastName, string streetAddress, string city, string state, string zip, string costCenter, string supervisor)
        // base class constructor call
        : base(firstName, lastName, streetAddress, city, state, zip)
        {

            CostCenter = costCenter;
            Supervisor = supervisor;
        }

        // Tostring method to provide string representation of object
        public string ToString()
        {
            string[] arr = { "Manager", "NA", CostCenter, Supervisor, "NA" };
            return base.ToString() + String.Join(", ", arr);
        }

        // function to return array of attributes
        public string[] GetRow()
        {
            string[] arr = base.GetRow();   // we get the attributes from base class Employee
            string[] arr2 = { "Manager", "NA", CostCenter, Supervisor, "NA" };

            // all attributes are concatenated
            string[] toreturn = arr.Concat(arr2).ToArray();
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
        public string ToString()
        {
            string[] arr = { "Developer", DeveloperType, "0", Supervisor, TaxType };

            return base.ToString() + String.Join(", ", arr);
        }


        // function to return array of attributes
        public string[] GetRow()
        {
            // we get the attributes from base class Employee
            string[] arr = base.GetRow();
            string[] arr2 = { "Developer", DeveloperType, "0", Supervisor, TaxType };

            // all attributes are concatenated
            string[] toreturn = arr.Concat(arr2).ToArray();
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

