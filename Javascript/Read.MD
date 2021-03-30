
# 자바스크립트

- let 와 var 차이점  
보통 자바스크립트에서 변수 선언시 사용되는 부분인데   
var, let, const 이렇게 3가지 변수 선언 방식이 존재한다.  
const : 상수라고 보면 된다. 재선언 및 재할당 불가능하다.  
var : 선언, 초기화 단계가 한번에 이루어진다.  
<br><br>
기본 변수 선언 단계 : **선언->초기화->할당**

``` javascript
  console.log(abc); // undefined  
  var abc; 
  console.log(abc); // undefined
  abc = 'test';
  console.log(abc); // test
```

let : 선언, 초기화 단계가 분리되어 진행한다.

``` javascript
  console.log(abc); // ReferenceError: abc is not defined error
  let abc; 
  console.log(abc); // undefined
  abc = 'test';
  console.log(abc); // test
```
 결론: 
 
- javasript 함수 정의 차이는?
- this가 뭐야?
- prototype이란?
- null, undefined, undeclared 차이가 뭐야?
- 클로저가 뭐야?
- 익명함수란?
