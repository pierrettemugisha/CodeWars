using System;

namespace CSharp
{
    class Program
    {

        static int fib(int n)
        {
            return n < 2 ? n : fib(n - 1) + fib(n - 2);
        }

        public static bool Narcissistic(int value)
        {
            // Code me
            double sum = 0;
            int _value = value;
            double count = Math.Ceiling(Math.Log10(value));
            while (_value > 0)
            {
                sum += Math.Pow(_value % 10, count);
                _value /= 10;
            }

            return sum == value;
        }

        static void Main(string[] args)
        {
            Console.WriteLine(Program.Narcissistic(153));
        }
    }
}
