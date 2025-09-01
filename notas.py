cal=int(input("Ingrese su calificacion: "))

if cal>=90:
    nota='A'
elif cal>=80:
    nota='B'
elif cal>=70:
    nota='C'
elif cal>=60:
    nota='D'
else:
    nota='F'

print(f"Su nota es: {nota}")