using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DemoApp
{
    class Developers : Employee
    {
        private String developerType;
        private String supervisor;
        private String taxType;

        public Developers() { }

        public Developers(string developerType, string supervisor, string taxType)
        {
            this.developerType = developerType;
            this.supervisor = supervisor;
            this.taxType = taxType;
        }
    }
}
