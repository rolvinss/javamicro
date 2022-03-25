
![image](https://user-images.githubusercontent.com/20879293/160077296-2cb1a51b-0468-4b1d-a365-b2e0b8d91ccf.png)



API Gateway:http://localhost:8765/

Eureka:http://localhost:8761/

Billing Microservice: http://localhost:8000/billing/tenant/bill/summary

Energy Microservice: http://localhost:8100/energy/faults/details

By API Gatway:

http://localhost:8765/billing/tenant/bill/summary

http://localhost:8765/energy/faults/details

for reselience and circuit breaker:

http://localhost:8765/billing/sample/retry

http://localhost:8765/billing/sample/circuit-breaker

http://localhost:8000/sample-api


Database login:
http://localhost:8000/h2-console
