
const formularioCheckout = document.querySelector('.formulario-checkout');

formularioCheckout.addEventListener('submit', function(event) {
    event.preventDefault();

    const inputsObrigatorios = document.querySelectorAll('input[required]');
    inputsObrigatorios.forEach((inputObrigatorio: HTMLInputElement) => {
        if(!inputObrigatorio.value) {
            inputObrigatorio.classList.add('is-invalid');
        }
    });

});

const inputsObrigatorios = document.querySelectorAll('input[required]');
inputsObrigatorios.forEach((inputObrigatorio: HTMLInputElement) => {
    inputObrigatorio.addEventListener('blur', function() {
        if(!inputObrigatorio.value) {
            inputObrigatorio.classList.add('is-invalid');
            inputObrigatorio.classList.remove('is-valid');
        } else {
            inputObrigatorio.classList.remove('is-invalid');
            inputObrigatorio.classList.add('is-valid');
        }
    });
});


const inputNumeroCartao: HTMLInputElement = document.querySelector('#numero-cartao');
inputNumeroCartao.addEventListener('input', function() {
    const digitado = inputNumeroCartao.value;
    const apenasNumeros = digitado.replace(/\D/g, '');
    inputNumeroCartao.value = apenasNumeros;
});