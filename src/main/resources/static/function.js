class Equantion {
  constructor(a, b, c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
}

async function calculate() {
  var body = new Equantion(document.getElementById("a").value, document.getElementById("b").value, document.getElementById("c").value);
  console.log(body)
  try {
    const response = await fetch('http://localhost:8281/api/expression', {
      method: 'POST',
      body: JSON.stringify(body),
      headers: {
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': 'http://localhost:8281/api/expression',
        'Access-Control-Allow-Origin': 'http://0.0.0.0:8281/api/expression',
        'Access-Control-Allow-Origin': 'origin',
        'Access-Control-Allow-Credentials': true,
        'Access-Control-Allow-Methods': 'GET, POST, PUT, DELETE',
        'Access-Control-Allow-Headers': 'Origin, X-Requested-With, Content-Type, Accept, Authorization, Cache-Control, Pragma'
      },
    });
    const jsonBody = await response.json();
    const result = JSON.parse(JSON.stringify(jsonBody));
    const finalString = result.equantion.a + "*x^2 + " + result.equantion.b + " *x +" + result.equantion.c + "\n" + result.message;
    console.log('Успех:', result);

    document.getElementById("answer").value= finalString;
  } catch (error) {
    console.error('Ошибка:', error);
  }
}
