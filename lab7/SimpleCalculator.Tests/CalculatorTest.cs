using NUnit.Framework;

namespace SimpleCalculator.Tests;

public class CalculatorTest
{
    [Test]
    public void Add_ShouldBeEqualTo_ExpectedAddition()
    {
        var firstNumber = -3.33;
        var secondNumber = 0.01;
        var expectedAddition = Math.Round(firstNumber + secondNumber, 2);
        var actualAddition = Calculator.Add(firstNumber, secondNumber);
        Assert.That(actualAddition, Is.EqualTo(expectedAddition));
    }

    [Test]
    public void Substract_ShouldBeEqualTo_ExpectedSubstraction()
    {
        var firstNumber = 1.99;
        var secondNumber = -0.01;
        var expectedSubstraction = Math.Round(firstNumber - secondNumber, 2);
        var actualSubstraction = Calculator.Subtract(firstNumber, secondNumber);
        Assert.That(actualSubstraction, Is.EqualTo(expectedSubstraction));
    }

    [Test]
    public void Multiply_ShouldBeEqualTo_ExpectedMultiplication()
    {
        var firstNumber = 583998;
        var secondNumber = 0.010101011001;
        var expectedMultiplication = Math.Round(firstNumber * secondNumber, 2);
        var actualMultiplication = Calculator.Multiply(firstNumber, secondNumber);
        Assert.That(actualMultiplication, Is.EqualTo(expectedMultiplication));
    }

    [Test]
    public void Divide_ShouldBeEqualTo_ExpectedDivision()
    {
        var firstNumber = 1337.9999;
        var secondNumber = 3.3333333333;
        var expectedDivision = Math.Round(firstNumber / secondNumber, 2);
        var actualDivision = Calculator.Divide(firstNumber, secondNumber);
        Assert.That(actualDivision, Is.EqualTo(expectedDivision));
    }

    [Test]
    public void Exponentiate_ShouldBeEqualTo_ExpectedExponentiation()
    {
        var number = 3.25;
        var power = 1.25;
        var expectedExponentiation = Math.Round(Math.Pow(number, power), 2);
        var actualExponentiation = Calculator.Exponentiate(number, power);
        Assert.That(actualExponentiation, Is.EqualTo(expectedExponentiation));
    }

    [Test]
    public void ExtractRoot_ShouldBe_Failed()
    {
        var number = 3234;
        var power = 5;
        var expectedExtraction = Math.Pow(number, 1 / power);
        var actualExtraction = Calculator.ExtractRoot(number, power);
        Assert.That(actualExtraction, Is.EqualTo(expectedExtraction));
    }

    [Test]
    public void Exponentiate_ShouldBeEqualTo_One()
    {
        var number = 5.555555;
        var power = 0;
        var expectedExponentiation = Math.Round(Math.Pow(number, power), 2);
        var actualExponentiation = Calculator.Exponentiate(number, power);
        Assert.That(actualExponentiation, Is.EqualTo(expectedExponentiation));
    }

    [Test]
    public void Exponentiate_ShouldBeEqualTo_ExpectedExponentiation_WhenPowerIsBelowZero()
    {
        var number = 5;
        var power = -12;
        var expectedExponentiation = Math.Round(Math.Pow(number, power), 2);
        var actualExponentiation = Calculator.Exponentiate(number, power);
        Assert.That(actualExponentiation, Is.EqualTo(expectedExponentiation));
    }

    [Test]
    public void Exponentiate_ShouldBeEqualTo_ExpectedExponentiation_WhenPowerIsBetweenZeroAndOne()
    {
        var number = 9;
        var power = 0.5;
        var expectedExponentiation = Math.Round(Math.Pow(number, power), 2);
        var actualExponentiation = Calculator.Exponentiate(number, power);
        Assert.That(actualExponentiation, Is.EqualTo(expectedExponentiation));
    }

    [Test]
    public void Divide_ShouldBeEqualTo_ExpectedDivision_WhenSecondNumberIsBelowZero()
    {
        var firstNumber = 25d;
        var secondNumber = -5d;
        var expectedDivision = Math.Round(firstNumber / secondNumber, 2);
        var actualDivision = Calculator.Divide(firstNumber, secondNumber);
        Assert.That(expectedDivision, Is.EqualTo(actualDivision));
    }
}