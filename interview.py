a=12
b=22
print(f"value of a is {a} value of b is {b} ")
a,b=b,a
print(f"value of a is {a} value of b is {b} ")
name="vivek"
print("name will be anything".split())
print(name[::-1])
print(name[-1])

print("find factorial")
def fact(n):
    if n==1:
        return n
    else:
        return n*fact(n-1)
print(fact(5))
print("factorial by simple for loop")    
factorial=1;
for i in range(1,6):
    factorial=factorial*i
print(factorial)


print("prime number program")
assume_num=5
if assume_num>1:
    for x in range(2,assume_num):
        if assume_num%2==0:
            print("not prime",assume_num)
            break
    else:
        print("prime:",assume_num)


pal="radar"
pal_check=pal[::-1]
if pal == pal_check:
    print("palindrome")
else:
    print("non pallindrome")

print("odd or even")
data=list(range(10))
print(data)
def odd_even(x):
    if x%2==0:
        return "even"
    else:
        return "odd"
lm=list(map(lambda x:x%2==0, data))
l1=list(filter(lambda x:x%2==0, data))
print("filter",l1)
print("map:",lm)


print("fibonacci series")

a,b=0,1
c=0
for i in range(0,10):
   c=a+b
   a,b=b,c 
   print(c)

