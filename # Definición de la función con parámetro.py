# Definición de la función con parámetro por defecto
def calcular_descuento(monto_total, porcentaje_descuento=10):
    """
    Calcula el descuento a aplicar sobre el monto total.
    :param monto_total: (float) Monto total de la compra
    :param porcentaje_descuento: (float) Porcentaje de descuento (por defecto 10%)
    :return: (float) Monto del descuento
    """
    descuento = monto_total * (porcentaje_descuento / 100)
    return descuento


# Programa principal
# Primera llamada: usando el valor por defecto del descuento (10%)
monto1 = 100.0
descuento1 = calcular_descuento(monto1)
monto_final1 = monto1 - descuento1

# Segunda llamada: usando un porcentaje de descuento diferente (por ejemplo, 20%)
monto2 = 200.0
descuento2 = calcular_descuento(monto2, 20)
monto_final2 = monto2 - descuento2

# Mostrar resultados
print("Primera compra:  Untitled1:25 - # Definición de la función con parámetro.py:25")
print(f"Monto total: ${monto1}  Untitled1:26 - # Definición de la función con parámetro.py:26")
print(f"Descuento aplicado: ${descuento1}  Untitled1:27 - # Definición de la función con parámetro.py:27")
print(f"Monto final a pagar: ${monto_final1}\n  Untitled1:28 - # Definición de la función con parámetro.py:28")

print("Segunda compra:  Untitled1:30 - # Definición de la función con parámetro.py:30")
print(f"Monto total: ${monto2}  Untitled1:31 - # Definición de la función con parámetro.py:31")
print(f"Descuento aplicado: ${descuento2}  Untitled1:32 - # Definición de la función con parámetro.py:32")
print(f"Monto final a pagar: ${monto_final2}  Untitled1:33 - # Definición de la función con parámetro.py:33")
