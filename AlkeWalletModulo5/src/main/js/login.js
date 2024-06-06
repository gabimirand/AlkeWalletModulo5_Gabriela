const usuario = document.getElementById('usuario');
const password = document.getElementById('contrasena');
const submit= document.getElementById('submit')


document.addEventListener('submit', function(Event) {
     Event.preventDefault();

    var user = document.getElementById('usuario').value;
    var pass = document.getElementById('contrasena').value;
    

    if (user === 'gabriela@gmail.com' && pass === '12345') {
        window.location.href = "vistas/home.jsp";
    } else {
        alert('Usuario y/o contraseña inválidos');
    }
   }); 