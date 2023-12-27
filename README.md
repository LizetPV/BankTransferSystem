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


**Entrada (Solicitud de Transferencia):**
```json
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

json

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
```


## **CREACION DEL PROYECTO CON SPRING INITIALIZR**

![image](https://github.com/LizetPV/Transfer2/assets/122371050/e280bca1-0c09-48b9-954b-a841c5b33c4d)

### **Uso de SpringBoot (controller/ service/repository)**

![image](https://github.com/LizetPV/Transfer2/assets/122371050/085c479b-3a4c-4ecf-b845-0749c4f7adf9)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/16926aa4-f237-411e-b3f8-d83532ff5b61)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/3b53d99a-86fa-4e65-b6df-0f531ccd8250)



#### **Implementando Lombok, MapStruct, Swagger, OpenApi en mi aplicación.**

**Model:**

![image](https://github.com/LizetPV/Transfer2/assets/122371050/06f8b2fb-e3b2-43e3-acc9-68585f0136fc)


![image](https://github.com/LizetPV/Transfer2/assets/122371050/eb6e9dd7-5d3b-4516-8fae-8cdca139ef41)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/02dd2cb7-b393-4f05-aef6-0d13094c42b9)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/8aac84b9-747e-4852-a494-75e97999a6c0)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/e59fc10a-261a-4911-aae9-47b6f5e28a55)

**Repository:**

![image](https://github.com/LizetPV/Transfer2/assets/122371050/01789307-6943-42a5-8492-9060a7e485a6)

**Controller:**

![image](https://github.com/LizetPV/Transfer2/assets/122371050/4f1d51ce-0c74-429e-aefd-b5b463e87e38)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/312ccc3d-2d3a-4cdc-b879-892c4b3b6e36)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/a673d8ab-a2b4-4c3e-b75b-15077da379f2)

**Service:**

![image](https://github.com/LizetPV/Transfer2/assets/122371050/0a9863f1-285c-43e9-96d5-c656fe63d3ca)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/0f70c3fd-11b6-4d2b-b701-13519bcdbb75)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/3833f999-6981-4e25-8615-aa1bc5e22ef8)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/813bb412-31da-47b7-ba50-f63d2ecbf3ca)

**Documentanción con Swagger:**

![image](https://github.com/LizetPV/Transfer2/assets/122371050/fa825719-075e-4a59-bb4f-2b685399c996)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/01feb909-c2c4-479f-9bc2-a64ec58269eb)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/1147f923-7ba2-4c37-b96d-3ee36370504d)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/e108fb46-7a3b-4736-a8cf-fedfd7fe0b80)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/c8ad7a41-4480-41f4-82c5-49e342e078ce)


## **DISEÑO DE BASE DE DATOS CON MYSQL**

### **Configurando dependencias para establecer la conexión con la base de datos:**
![image](https://github.com/LizetPV/Transfer2/assets/122371050/76a555ab-f800-4b8a-afd9-b3bde789c596)

### **Archivo Propertice:**
![image](https://github.com/LizetPV/Transfer2/assets/122371050/b829186e-23de-4289-bfb7-33032dd4abfa)

### **Definición de las entidades:**
![image](https://github.com/LizetPV/Transfer2/assets/122371050/195a29f9-9d80-45cb-8ff2-0fc868982bb4)

### **Definición de métodos:**

![image](https://github.com/LizetPV/Transfer2/assets/122371050/1aa03a46-6dd6-4eb4-816a-6dba5647c083)

### **Implementación de métodos:**

![image](https://github.com/LizetPV/Transfer2/assets/122371050/92346505-758b-43dd-9dba-19409ecdd22d)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/abd91f03-d9b8-4140-b001-29d50e05f24b)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/2d416e89-dd65-46b7-8086-d5fbbcfffe50)

### **Creación de mi BD en MYSQL:**
![image](https://github.com/LizetPV/Transfer2/assets/122371050/8757c19c-64b7-46ea-8349-e1a3efd11115)

### **Realizando peticiones GET Y POST en POSTMAN:**

![image](https://github.com/LizetPV/Transfer2/assets/122371050/3225536a-bc55-4004-adf7-55d4f641e023)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/8b20cc89-b4ee-4c65-abaf-c11d4720b2f3)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/bf0b94cb-cf5e-4d04-829f-393d8304e66b)


## **PRUEBAS UNITARIAS:**

**Implementación de los test para controller:**

![image](https://github.com/LizetPV/Transfer2/assets/122371050/70668935-e561-49d8-bbf0-002518a32b27)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/8087ffb2-80fc-49c7-863e-16a92688d564)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/71398421-9a94-46e8-8684-ec935b889d35)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/5c8d4264-e67f-4904-b941-de2164eebb3e)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/2c329ca7-5887-45c7-893f-a61ff4c6d9bc)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/f2bc1a29-2ce1-43b1-81db-2e50c15f3829)

![image](https://github.com/LizetPV/Transfer2/assets/122371050/d66dc7bc-ad48-4f3d-af18-7e6eb40495fd)

## **Conclusión**

En este README, se ha detallado el proceso de creación del proyecto con Spring Initializr, la implementación de un sistema de transferencias interbancarias, el diseño de la base de datos con MySQL, así como la configuración y pruebas unitarias. Se han cubierto aspectos esenciales del desarrollo, desde la configuración de dependencias hasta la implementación de métodos y la realización de pruebas unitarias.

Para acceder al código fuente y explorar más a fondo el proyecto, puede revisar el repositorio en GitHub: [Transfer2 Repository](https://github.com/LizetPV/Transfer2).

Gracias por explorar esta documentación. Si tienes alguna pregunta o sugerencia, no dudes en contactarme.
---

*Este README fue creado por [Yesenia Peche] - [lizet.peche@gmail.com] - [26/12/2023]*










