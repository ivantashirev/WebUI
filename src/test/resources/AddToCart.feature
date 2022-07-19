Feature: Добавляем товар в корзину

  Background:
    Given User authorized

    @hooks
      @close
    Scenario:
      When Click SauceLabsBackpack button in page
      And remove SauceLabsBackpack
      Then logout user