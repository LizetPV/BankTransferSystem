## **UH: TRANSFERENCIA INTERBANCARIA**

### **DESCRIPCIÓN:**  
El cliente debe realizar la transferencia de una cuenta a otra, ingresando el importe a transferir, la moneda, la cuenta origen y la cuenta destino
- No se podrá transferir a la misma cuenta
- El importe ingresado deberá ser mayor a cero
- Las cuentas deberán tener 16 dígitos
- La moneda sólo podrá ser SOLES o DÓLARES
- El resultado de la operación deberá retornar el saldo disponible de la cuenta Origen y los datos de beneficiario de la cuenta Destino

### **DISEÑO DE SOLUCIÓN:**

#### **Diseño de base de datos:**
- Diseño conceptual.
- Modelo lógico.
- Modelo físico.

#### **DISEÑO CONCEPTUAL:**

 ![image](https://github.com/LizetPV/Transfer2/assets/122371050/4bf66bf5-f7a9-48fa-ba29-d9764d7eb6b7)

#### **MODELO LÓGICO:**

![image](https://github.com/LizetPV/Transfer2/assets/122371050/14e324e1-a9fa-49ff-a5c7-7c1ec0150f38)

#### **MODELO FÍSICO:**
 
![image](https://github.com/LizetPV/Transfer2/assets/122371050/a6176358-3f01-4792-b9f0-9daa3110af13)


#### **DISEÑO DE MICROSERVICIOS - MODELO C4:**

- **DIAGRAMA CONTEXTO:**

![image](https://github.com/LizetPV/Transfer2/assets/122371050/e3f0fc20-8945-4a9b-befb-126b81e4ba31)


- **DIAGRAMA CONTENEDORES:**

![image](https://github.com/LizetPV/Transfer2/assets/122371050/fabf2908-3f0e-4876-8941-043d574b821e)


- **DIAGRAMA COMPONENTE:**

![image](https://github.com/LizetPV/Transfer2/assets/122371050/299cd3e6-2e8b-4957-b598-86512fdac6d4)


- **DIAGRAMA CÓDIGO:**

![image](https://github.com/LizetPV/Transfer2/assets/122371050/b4d545aa-dba9-478c-811f-8efd8e21fc2d)


### **Json de Entrada y Salida:**

Entrada (Solicitud de Transferencia):
```json
Json de Entrada y Salida:

Entrada (Solicitud de Transferencia):
json
{
  "sourceAccount": {
    "accountNumber": "1234567891011121",
    "name": "Carlos Lara"
  },
  "destinationAccount": {
    "accountNumberCCI": "1234567890123456",
    "name": "Roberto Nuñez"
  },
  "amount": 500.00,
  "currency": "S/"
}

Salida (Resultado de la Operación):

```json
{
  "status": "success",
  "message": "operación exitosa",
  "sourceAccountBalance": 2500.00,
  "date": "2023-21-11 10-22-23",
  "destinationAccountInfo": {
    "bankName": "BBVA",
    "accountNumberCCI": "1234567890123456",
    "ownerName": "Carlos Lara"
  }
}



