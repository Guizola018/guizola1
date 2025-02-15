<script>
    // JavaScript para abrir e fechar as janelas modais
    const loginModal = document.getElementById('loginModal');
    const signupModal = document.getElementById('signupModal');
    const btnLogin = document.getElementById('btnLogin');
    const btnSignup = document.getElementById('btnSignup');
    const closeLogin = document.getElementById('closeLogin');
    const closeSignup = document.getElementById('closeSignup');

    function openModal(modal) {
        modal.style.display = 'block';
        document.body.style.overflow = 'hidden'; // Desabilita a rolagem da página
    }

    function closeModal(modal) {
        modal.style.display = 'none';
        document.body.style.overflow = 'auto'; // Habilita a rolagem da página
    }

    btnLogin.onclick = function() {
        openModal(loginModal);
    }

    btnSignup.onclick = function() {
        openModal(signupModal);
    }

    closeLogin.onclick = function() {
        closeModal(loginModal);
    }

    closeSignup.onclick = function() {
        closeModal(signupModal);
    }

    window.onclick = function(event) {
        if (event.target == loginModal) {
            closeModal(loginModal);
        }
        if (event.target == signupModal) {
            closeModal(signupModal);
        }
    }
</script><script>
    // JavaScript para abrir e fechar as janelas modais
    const loginModal = document.getElementById('loginModal');
    const signupModal = document.getElementById('signupModal');
    const btnLogin = document.getElementById('btnLogin');
    const btnSignup = document.getElementById('btnSignup');
    const closeLogin = document.getElementById('closeLogin');
    const closeSignup = document.getElementById('closeSignup');

    function openModal(modal) {
        modal.style.display = 'block';
        document.body.style.overflow = 'hidden'; // Desabilita a rolagem da página
    }

    function closeModal(modal) {
        modal.style.display = 'none';
        document.body.style.overflow = 'auto'; // Habilita a rolagem da página
    }

    btnLogin.onclick = function() {
        openModal(loginModal);
    }

    btnSignup.onclick = function() {
        openModal(signupModal);
    }

    closeLogin.onclick = function() {
        closeModal(loginModal);
    }

    closeSignup.onclick = function() {
        closeModal(signupModal);
    }

    window.onclick = function(event) {
        if (event.target == loginModal) {
            closeModal(loginModal);
        }
        if (event.target == signupModal) {
            closeModal(signupModal);
        }
    }
</script>