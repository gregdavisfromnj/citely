$('#header-nav').find('a[href="' + location.pathname + '"]').closest('li').addClass('active');

document.getElementById('logout-btn').onclick = function () {
  window.location.href = 'logout';
}