
# 자바스크립트

- let 와 var 차이점  
보통 자바스크립트에서 변수 선언시 사용되는 부분인데   
var, let, const 이렇게 3가지 변수 선언 방식이 존재한다.  

const : 상수라고 보면 된다. 재선언 및 재할당 불가능하다.  
``` javascript
    const abc = test;
    abc = 123; // Assignment to constant variable.
``` 

var : 선언, 초기화 단계가 한번에 이루어진다.  

※ Temporal Dead Zone(TDZ) - 초기화되지 않는 변수가 있는곳  
<img src="https://dmitripavlutin.com/static/7973b25e51eb97f6d330c941600f7ad8/7c84e/temporal-dead-zone-in-javascript.webp" width="700" height="370">
>https://dmitripavlutin.com/javascript-variables-and-temporal-dead-zone/


<br>
기본 변수 선언 단계 : 선언->초기화->할당 

``` javascript
  console.log(abc); // undefined  TDZ 발생
  var abc; // Declaration
  console.log(abc); // undefined
  abc = 'test'; // initialization 
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
 결론: 값이 변하면 안될때는 const 사용하고 기본적으로 
 let 사용하자 var 사용시 여러변수명이 동일 하게되면 어디서문제가 되는지 파악이 어렵다.
 let 사용시 선언이 되었는지 확인이 쉽기때문에 가독성이 높다.
 
 
- javasript 함수 정의 차이는?
- this가 뭐야?
- prototype이란?
- null, undefined, undeclared 차이가 뭐야?
- 클로저가 뭐야?
- 익명함수란?
