#import pandas
import pandas as pd

#create a dictionary
data = {
        "X" : [1, 2, 3, 4, 5],
        "Y" : [12, 13, 14, 15, 16],
        "Z" : [20, 23, 24, 25, 26],

}
#create a new dataframe using our dictionary
table = pd.DataFrame(data)

# print dataframe
print(table)