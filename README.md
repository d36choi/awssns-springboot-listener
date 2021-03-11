# awssns-springboot-listener

## awssns-springboot-listener
amazon SNS 로부터 들어온 메시지를 리스닝 하는 메시지 리스너 서버입니다.  
springboot message listener (from amazon SNS)

## features
notification message listening
auto subscription confirm

## MUST DO
```properties
cloud.aws.credentials.access-key=<ACCESSKEY>
cloud.aws.credentials.secret-key=<SECRETKEY>

```
위 application.properties 의 AWS Credential 항목들을 본인의 환경에 맞게 입력해야 합니다.  
you should add AWS Credentials in application.properties.

## guideline
[[AWS] amazon SNS + Spring Boot 이용한 메시지 서비스 만들기](https://choichumji.tistory.com/123)

[aws sns springboot publisher](https://github.com/d36choi/awssns-springboot)
