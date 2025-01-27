**Eureka Server example -** \
https://sysout.ru/mikroservisy-eureka-i-client-side-load-balancing/

Что содержится в данной ссылке:
1. Eureka Server и 2 микросервиса:
   2. Микросервис - random-animal, в котором создается список животных в AnimalDao, Animal который содержит животное, Controller который выдает случайное животное из списка;
   3. Микросервис - zoo, в который поступает информация из random-animal с помощью Feign Client, а далее передается в контроллер и переводится в ResponseEntity (не знаю зачем)

Прочие введения, как Jersey3, нужны для работы всей этой системы включая Eureka. Порты - 8761, 8081, 8082.

**Spring Cloud API Gateway -** \
https://sysout.ru/spring-cloud-api-gateway/


