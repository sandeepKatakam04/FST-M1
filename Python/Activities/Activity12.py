def calculateSum(n):
    if n <= 1:
        return n
    else:
        return  n + calculateSum(n-1)

num = int(input("eneter a num to calculate the sum: "))
print(calculateSum(num))
