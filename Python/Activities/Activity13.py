def sumofList(numbers):
    sum = 0
    for number in numbers:
        sum += int(number)
    return sum

numList = list(input("enter a sequence of comma separated numbers: ").split(","))

print("Given list of numbers: ", numList)

result = sumofList(numList)

print("sum of numbers in a list = ", result)
