<template>
  <div class="topbar navbar navbar-default">
    <el-menu mode="horizontal">
      <el-menu-item index="1">
        <div class="navbar-header">
          <a class="navbar-brand" href="https://questplanet.ru/">
            <img alt="Questplanet" class="logo" src="../../assets/qp-logo.png">
          </a>
          <ul class="nav navbar-nav navbar-left call-me-block">
            <li class="phone nonmobile-version">
              <p class="number">
                <span class="bold">8 (800) 511-02-16</span><br>
                <span class="bold">8 (499) 322-25-50</span>
              </p>
              <a class="call-me-link button-style-1 min" data-target="#call-be-modal" data-toggle="modal">
                <span class="bold">Заказать звонок</span>
              </a>
            </li>
            <li class="phone mobile-version">
              <a class="call-me-link button-style-1 min" data-target="#call-be-modal" data-toggle="modal">
                <i class="fa fa-phone fa-flip-horizontal"></i>
              </a>
              <p class="number"><b>8 (800) 511-02-16</b><br><b>8 (499) 322-25-50</b></p>
            </li>
          </ul>
        </div>
      </el-menu-item>
      <el-menu-item index="2" class="nav navbar-nav navbar-right">
        <ul class="nav navbar-nav navbar-right">
          <li class="nonmobile-version"><a class="" href="https://questplanet.ru/games">Мои игры</a></li>
          <li class="dropdown menu-dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                                                aria-haspopup="true" aria-expanded="false"> <span class="text"><span
              class="fa fa-bars"></span></span> <i class="fa fa-times close-menu"></i> </a>
            <ul class="dropdown-menu main-menu-wrapper">
              <li><a href="#"><b>Категории</b></a></li>
              <li><a href="/wedding"> Свадебные квесты </a></li>
              <li><a href="/city"> Квест-экскурсии по городам </a></li>
              <li role="separator" class="divider"></li>
              <li><a href="#"><b>Дополнительные услуги</b></a></li>
              <li><a href="/individual">Квест в Вашем стиле</a></li>
              <li><a href="/vip">VIP квест</a></li>
              <li><a href="https://questplanet.ru/certificate">Подарочный сертификат</a></li>
              <li role="separator" class="divider"></li>
              <li><a href="#"><b>Личный кабинет</b></a></li>
              <li><a>Максим</a></li>
              <li role="separator" class="divider"></li>
              <li><a class="" href="https://questplanet.ru/users/edit">Редактировать профиль</a></li>
              <li><a class="" href="https://questplanet.ru/games">Мои квесты</a></li>
              <li><a class="" href="https://questplanet.ru/certificates">Мои сертификаты</a></li>
              <li><a class="" href="https://questplanet.ru/orders">Квесты в моем стиле</a></li>
              <li><a data-method="delete" href="/users/sign_out">Выйти</a></li>
            </ul>
          </li>
        </ul>
      </el-menu-item>
    </el-menu>
  </div>
</template>

<script>
  export default {
    name: 'Topbar',
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
  .topbar .el-menu--horizontal > .el-menu-item {
    height: 100%;
  }

  .topbar .nav.navbar-nav.navbar-left.call-me-block {
    line-height: 22px;
  }

</style>
