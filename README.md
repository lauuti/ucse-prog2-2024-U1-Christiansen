# ucse-prog2-2024-U1-Christiansen
Patrones aplicados para mejorar la adaptacion del sistema para cambios futuros:
- Agregado de una nueva categoria:
  FactoryMethod facilita la posiiblidad de agregar nuevas categorias de productos sin modificar el codigo existente, crenado una nueva clase que implemente la interfaz product y una nueva fabrica que exstiende ProductFactory. Esto permite que el sistema crezca de manera organizada y como minimo impacto en la demas partes del codigo
- Modificacion del costo de envio de un tupo de envio particular:
  Strategy se usa para calcular el costo de envio, permitiendo cambiar la estrategia de envio sin necesidad de modificar el codigo del sistema. Se actualiza la implementacion correspondiente de ShippingStrategy o se crea una nueva estrategia de envio si es necesario
- Agregado de un medio de pago nuevo:
  Bridge permite agregar nuevos metodos de pago con facilidad, implementando una nueva clase que extiende de PaymentProcessor y una nueva implementacion de PaymentGateway, sin alteriar el codigo que maneja la logica de negocio o las categorias de los productos.
  
Formas canonicas:

![image](https://github.com/user-attachments/assets/8fb536c2-b875-44c9-bbba-9c4780552ccf)
FactoryMethod:
- La interfaz product es implementada por Electronica, Ropa y Vehiculos
- La clase abstracta ProductFactory es extendida por ElectronicaFactory, RopaFactory y VehiculosFactory
- La clase ProductSelector usa las Factory concretas (las flechas indican dependencia)

![image](https://github.com/user-attachments/assets/ebebc54f-5247-4c66-acc1-f92ff2e1a805)
Bridge:
- La interfaz PaymentGateway es implementado por PaypalPaymentGateway y MercadoPagoPaymentGateway
- La clase abstracta PaymentProcessor es extendida por PaypalPaymentProcessor y MercadoPagoPaymentProcessor
- PaymentManager depende de los PaymentProcessor concretos

![image](https://github.com/user-attachments/assets/092ed3a8-576c-4372-a775-7f0bc7cf52ff)
Strategy:
- ShippingStrategy es implementado por AirShippingStrategy, TruckShippingStrategy u BoatShippingStrategy
- ShippingCalculator usa una instancia de ShippingStrategy
