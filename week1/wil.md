# 1주차 강의 내용 
## 웹의 기초와 통신 구조
인터넷은 전 세계 기기를 연결하는 거대한 네트워크이며, 웹은 그 위에서 동작하는 서비스 중 하나입니다.
클라이언트-서버 모델은 요청을 보내는 클라이언트와 이를 처리하여 응답을 보내는 서버 간의 통신 구조입니다.
URL은 리소스의 위치를 나타내며, 프로토콜, 호스트, 포트, 경로, 쿼리 등으로 구성됩니다.
## HTTP 프로토콜
HTTP 프로토콜은 서버가 이전 상태를 저장하지 않는 무상태성과, 응답 후 연결을 끊는 비연결성이 특징입니다.
HTTP 메서드는 리소스를 다루는 주요 도구이며, 조회, 추가, 교체 및 수정, 삭제가 가능합니다.
또 200(성공), 404(찾을 수 없음) 등 요청의 결과를 숫자로 표현하는 상태 코드들이 존재합니다.
## API 및 REST API
API는 프로그램 간 데이터나 기능을 주고받기 위해 정해놓은 약속입니다.
REST API는 URI 등으로 구성된 아키텍처 스타일이고, 데이터 전송 시 가장 일반적으로 사용되는 표준 형식은 JSON입니다.

# Whitelabel Error Page
https://github.com/Tarong3/2026s_1/issues/1#issue-4158573801

# API 명세서 (회원 기능 포함)
## 회원 기능
### 1. 회원 등록
HTTP Method : POST
URI : /members
### 2. 회원 목록 조회
HTTP Method : GET
URI : /members
### 3. 개별 회원 정보 상세 조회
HTTP Method : GET
URI : /members/{memberID}
### 4. 회원 정보 수정
HTTP Method : PATCH
URI : /members/{memberID}
### 5. 회원 삭제
HTTP Method : DELETE
URI : /members/{memberID}
## 상품 기능
### 1. 상품 정보 등록
HTTP Method : POST
URI : /items
### 2. 상품 목록 조회
HTTP Method : GET
URI : /items
### 3. 개별 상품 정보 상세 조회
HTTP Method : GET
URI : /items/{itemID}
### 4. 상품 정보 수정
HTTP Method : PATCH
URI : /items/{itemID}
### 5. 상품 삭제
HTTP Method : DELETE
URI : /items/{itemID}
## 주문 기능
### 1. 주문 정보 생성
HTTP Method : POST
URI : /orders
### 2. 주문 목록 조회
HTTP Method : GET
URI : /orders
### 3. 개별 주문 정보 상세 조회
HTTP Method : GET
URI : /orders/{orderID}
### 4. 주문 취소
HTTP Method : DELETE
URI : /orders/{orderID}