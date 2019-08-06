using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Week4Employee
{
   
    public class Employee
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string StreetAddress { get; set; }
        public string City { get; set; }
        public string State { get; set; }
        public string Zip { get; set; }
        public string Age { get; set; }

        // constructor
        public Employee(string firstName, string lastName, string streetAddress, string city, string state, string zip, string age)
        {
            FirstName = firstName;
            LastName = lastName;
            StreetAddress = streetAddress;
            City = city;
            State = state;
            Zip = zip;
            Age = age;
        }

        // Tostring method 
        public new string ToString()
        {
            string[] arr = { FirstName, LastName, StreetAddress, City, State, Zip, Age };
            return String.Join(", ", arr);
        }

        // function
        public string[] GetRow()
        {
            string[] array = { FirstName, LastName, StreetAddress, City, State, Zip, Age };
            return array;
        }
    }

    
    public class Manager : Employee
    {
        public string Title { get; set; }
        public string Supervisor { get; set; }

        // Constructor 
        public Manager(string firstName, string lastName, string streetAddress, string city, string state, string zip, string age, string title, string supervisor)
        // base class constructor
        : base(firstName, lastName, streetAddress, city, state, zip, age)
        {

            Title = title;
            Supervisor = supervisor;
        }

        // Tostring method 
        public new string ToString()
        {
            string[] arr = { "Manager", "NA", Title, Supervisor, "NA" };
            return base.ToString() + String.Join(", ", arr);
        }

        // function 
        public new string[] GetRow()
        {
            string[] arr = base.GetRow();   
            string[] arr2 = { "Manager", "NA", Title, Supervisor, "NA" };

            
            string[] toreturn = arr.Concat(arr2).ToArray();
            Console.WriteLine(toreturn[6]);
            return toreturn;
        }
    }

    public class Developer : Employee
    {
        public string DeveloperType { get; set; }
        public string Salary { get; set; }
        public string Title { get; set; }

        // Constructor 
        public Developer(string firstName, string lastName, string streetAddress, string city, string state, string zip, string developerType, string salary, string age)
        // base class constructor 
        : base(firstName, lastName, streetAddress, city, state, zip, age)
        {
            DeveloperType = developerType;
            Salary = salary;
            Title = Title;
        }

        // Tostring method 
        public new string ToString()
        {
            string[] arr = { "Developer", DeveloperType, "0", Salary, Title };

            return base.ToString() + String.Join(", ", arr);
        }


        // function 
        public new string[] GetRow()
        {
            
            string[] arr = base.GetRow();
            string[] arr2 = { "Developer", DeveloperType, "0", Salary, Title };
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
