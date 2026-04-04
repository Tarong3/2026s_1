# 2주차 강의 내용
## 계층형 아키텍처 (Layered Architecture)
계층형 아키텍처는 어플리케이션을 역할에 따라 계층별로 나누어 설계하는 방식으로, 레스토랑에 비유하여 이해할 수 있음  
**Browser (손님)** - 서비스 사용자  
**Controller (웨이터)** - 요청을 받고 응답을 전달하는 진입점  
**Service (주방장)** - 핵심 비즈니스 로직을 수행  
**DAO/Repository (창고 관리인)** - DB에서 데이터를 출고 또는 입고  
**DB (창고)** - 데이터가 실제로 저장되는 공간
## DTO & Entity
**DTO (Data Transfer Object)** : 데이터 전송을 위한 객체로, 소통 목적에 맞는 정보만 포함하며 서비스 간 데이터 교환에 사용됨  
**Entity** : DB 테이블과 직접 맵핑되는 핵심 객체로, 모든 정보를 포함하며 보안 및 데이터 일관성을 위해 외부 노출 X
## Controller 계층
역할 : HTTP 요청을 가장 먼저 처리하고 응답을 반환하는 접점  
언급 : @RestController, @RequestMapping, @RequestBody 등
## Service 계층
역할 : 어플리케이션의 핵심 비즈니스 로직이 담기는 곳으로, Controller와 Repository 사이의 다리  
Transaction : 쪼갤 수 없는 업무의 단위인 원자성을 보장.  
언급 : @Transactional, "readOnly = true" 등
## Spring Bean & 의존성 주입
**Spring Bean** : 스프링 컨테이너에서 관리하는 공용 객체  
**의존성 주입 (Dependency Injection, DI)** : 객체를 직접 생성하지 않고 외부에서 주입받는 방식, 메모리 사용의 효율성 증가  
**생성자 주입** : 권장되는 DI의 방법으로, final 키워드를 통하여 간결한 구현 가능
## 패키지 구조 추천
**도메인형 구조** : 특정 도메인(Member, Product 등)과 관련된 모든 클래스를 한 곳에 모으는 구조로, 코드 탐색 및 유지보수가 용이