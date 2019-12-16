one = {
'name':'vin',
'age':23,
'isActive':True
}

two = {
'name':'vin2',
'age':233,
'isActive':False
}

a = [one, two]
for i in a:
        if i['age'] >50:
            print(i['name'])
        else:
            print("to young")