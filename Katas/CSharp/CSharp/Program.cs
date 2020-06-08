using System;

namespace CSharp
{
    class Program
    {

        static int fib(int n)
        {
            return n < 2 ? n : fib(n - 1) + fib(n - 2);
        }
        static void Main(string[] args)
        {
            Console.WriteLine(Program.fib(8));
        }
    }
}
