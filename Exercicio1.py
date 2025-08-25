# Solicita os números ao usuário
num1 = float(input("Digite o primeiro número: "))
num2 = float(input("Digite o segundo número: "))

# Operações
soma = num1 + num2
subtracao = num1 - num2
multiplicacao = num1 * num2
divisao = num1 / num2 if num2 != 0 else "Indefinida (divisão por zero)"
divisao_inteira = num1 // num2 if num2 != 0 else "Indefinida (divisão por zero)"
modulo = num1 % num2 if num2 != 0 else "Indefinido (divisão por zero)"
exponenciacao = num1 ** num2

# Exibe os resultados
print(f"\nResultados para {num1} e {num2}:")
print(f"Soma: {soma}")
print(f"Subtração: {subtracao}")
print(f"Multiplicação: {multiplicacao}")
print(f"Divisão: {divisao}")
print(f"Divisão Inteira: {divisao_inteira}")
print(f"Módulo: {modulo}")
print(f"Exponenciação: {exponenciacao}")