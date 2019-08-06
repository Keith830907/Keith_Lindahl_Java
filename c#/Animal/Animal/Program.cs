using Inheritance;
using System;
using System.IO;
using System.Runtime.Serialization;
using System.Runtime.Serialization.Formatters.Binary;

namespace Inheritance
{
    [Serializable]
    public class Animal
    {
        protected string name;
        protected int legs;
        protected string food;

        public Animal() { }

        public Animal(string Name, int Legs, string Food)
        {
            this.name = Name;
            this.legs = Legs;
            this.food = Food;
        }

        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        public int Legs
        {
            get { return legs; }
            set { legs = value; }
        }

        public string Food
        {
            get { return food; }
            set { food = value; }
        }

        public void describeAnimal()
        {
            Console.WriteLine(name + " has " + legs + " legs and eats " + food);
        }
    }
}

[Serializable]
class Dog : Animal
{
    public Dog(string Name, int Legs, string Food) : base(Name, Legs, Food)
    {

    }
}
[Serializable]
class Wolf : Animal
{
    public Wolf(string Name, int Legs, string Food) : base(Name, Legs, Food)
    {

    }
}
[Serializable]
class Bird : Animal
{
    public Bird(string Name, int Legs, string Food) : base(Name, Legs, Food)
    {

    }
}

[Serializable]
class Program
{
    static void Main(string[] args)
    {
        Dog dog1 = new Dog("Max the Dog", 4, "Meat");
        dog1.describeAnimal();

       Wolf wolf1 = new Wolf("Peiyode the Wolf", 4, "Raw Meat");
        wolf1.describeAnimal();

        Bird bird1 = new Bird("Bill the Bird", 2, "BirdSeed");
        bird1.describeAnimal();

        IFormatter formatter = new BinaryFormatter();
        Stream stream = new FileStream(@"C:\ExampleNew.txt", FileMode.Create, FileAccess.Write);

        formatter.Serialize(stream, dog1);
        formatter.Serialize(stream, wolf1);
        formatter.Serialize(stream, bird1);
        stream.Close();

        stream = new FileStream(@"C:\ExampleNew.txt", FileMode.Open, FileAccess.Read);
        Dog dognew = (Dog)formatter.Deserialize(stream);
        Wolf wolfnew = (Wolf)formatter.Deserialize(stream);
        Bird birdnew = (Bird)formatter.Deserialize(stream);

        Console.WriteLine(dognew.Name);
        Console.WriteLine(dognew.Legs);
        Console.WriteLine(dognew.Food);

        Console.WriteLine(wolfnew.Name);
        Console.WriteLine(wolfnew.Legs);
        Console.WriteLine(wolfnew.Food);

        Console.WriteLine(birdnew.Name);
        Console.WriteLine(birdnew.Legs);
        Console.WriteLine(birdnew.Food);

        Console.ReadKey();

        Console.ReadLine();
    }
}
