fruits_dict = {"mango": 100, "guava":30, "grapes":50, "watermelon":25}

fruits_check = str(input("Which fruit are you looking for : ")).lower()

if(fruits_check in fruits_dict):
    print("Yes,",fruits_check," is available")
else:
    print("No,",fruits_check," is not available")

    