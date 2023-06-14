def automorphic(n):
    sqr = n*n
    if sqr%(10**len(str(n))) == n:
        print("Its a Automorphic number. ")
    else:
        print("Its not an Automorphic number. ")

a=int(input("Enter the number: "))
automorphic(a)
