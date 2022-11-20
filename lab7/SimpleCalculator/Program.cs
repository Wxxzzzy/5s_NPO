using SimpleCalculator;

Console.ForegroundColor = ConsoleColor.Magenta;

Console.WriteLine("5 + 5.4 = " + Calculator.Add(5, 5.4));
Console.WriteLine("6.28 + 5 = " + Calculator.Subtract(6.28, 5));
Console.WriteLine("7.44 * 5.45 = " + Calculator.Multiply(7.44, 5.45));
Console.WriteLine("50.5 / 2 = " + Calculator.Divide(50.5, 2));
Console.WriteLine("121^3.25 = " + Calculator.Exponentiate(121, 3.25));
Console.WriteLine("121^(1/2) = " + Calculator.ExtractRoot(121, 2) + " <--- root ");