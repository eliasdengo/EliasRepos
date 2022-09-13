# Design of student or blue print of student
#_________________________________________________________
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
#_____________________________________________________________
class child(student):
 #     pass  #please leave me alone i didn't have work
 def __init__(self, name, age, sex, school, grade,cgp):
        super().__init__(name, age, sex, school, grade)
        self.cgp=cgp
  
name=input("what is your Name ?")
sex=input(" are you male or female ?")
age=input("what old are you ?")
school=input("where do you learn ?")
grade=input("what grade are you ?")
cgp=input("what is your total grade ?")

s=student(name,age,sex,school,grade)
c=child(name,age,sex,school,grade,cgp)
s.age="67" #to update age of student from an object
#del s.grade
s.personal()
c.personal()
print(c.cgp)

        