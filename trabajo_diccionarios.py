# ===========================
# Tarea: Trabajando con Diccionarios
# ===========================

# 1. Crear un diccionario con información personal (usando tus datos)
informacion_personal = {
    "nombre": "Adan Córdova",
    "edad": 18,
    "ciudad": "Guayaquil",
    "profesion": "Ejerciendo una carrera"
}

# 2. Acceder y modificar el valor de la clave "ciudad"
informacion_personal["ciudad"] = "Guayaquil "  # Cambio de ciudad

# 3. Agregar una nueva clave-valor al diccionario (profesion se actualiza)
informacion_personal["profesion"] = "Estudiante universitario"

# 4. Verificar si la clave "telefono" existe, si no, agregarla
if "telefono" not in informacion_personal:
    informacion_personal["telefono"] = "0999495596"  # Número ficticio

# 5. Eliminar la clave "edad" del diccionario
if "edad" in informacion_personal:
    del informacion_personal["edad"]

# 6. Imprimir el diccionario final
print("Diccionario final de información personal:  Untitled1:28 - trabajo_diccionarios.py:28")
print(informacion_personal)
