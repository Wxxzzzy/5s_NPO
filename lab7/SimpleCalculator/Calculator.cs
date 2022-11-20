namespace SimpleCalculator;

public static class Calculator
{
    public static double Add(double x, double y) => RoundNumber(x + y);

    public static double Subtract(double x, double y) => RoundNumber(x - y);

    public static double Multiply(double x, double y) => RoundNumber(x * y);

    public static double Divide(double x, double y) => RoundNumber(x / y);

    public static double Exponentiate(double number, double power)
    {
        if (power % 1 == 0 && power > 0) 
        {
            var originNum = number;
            for (int i = 0; i < power; i++) 
            {
                number *= originNum;
            }
            RoundNumber(number);
        }

        return RoundNumber(Math.Pow(number, power));
    }

    public static double ExtractRoot(double number, double power) => RoundNumber(Math.Pow(number, 1 / power));

    private static double RoundNumber(double number) => Math.Round(number, 2);
}