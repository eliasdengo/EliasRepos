
class first_class:
    x=7

n=first_class()
print(n.x)

# init function in the class

class person:
    def __init__(self,name,age,sex):
        self.name=name
        self.age=age
        self.sex=sex
        
        
        
p1=person("Elias",25,"male")
print(p1.name)
print(p1.age)
print(p1.sex)


# class with another function and _init_

class student:
    def __init__(self,name,age,sex,school,grade):
        self.name=name
        self.age=age
        self.sex=sex
        self.school=school 
        self.grade=grade
        
    def personal(self):
        
        print("Name:"+self.name)   
        print("Sex:"+self.sex)
        print("Age:"+self.age)
        print("School:"+self.school)
        print("Grade:"+self.grade)


name=input("what is your Name ?")
sex=input(" are you male or female ?")
age=input("what old are you ?")
school=input("where do you learn ?")
grade=input("what grade are you ?")
s=student(name,age,sex,school,grade)
s.age="67" #to update age of student from an object
del s.grade
s.personal()
        
