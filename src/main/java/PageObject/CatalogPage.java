package PageObject;

import com.codeborne.selenide.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static java.lang.Thread.sleep;

public class CatalogPage {

    public static final String DIAMANT_CATALOG = "https://diamant.dev.sokolov.io/catalog";
    public static final String DIAMANT_CATALOG_COMPLECTS = "https://diamant.dev.sokolov.io/catalog/complect/";

    //Лист родителей фильтра Категория
    @FindBy(how = How.CSS, using = ".field-radio--solid")
    private ElementsCollection listFilterCategory;

    //Выбранный элемент фильтра Категория
    @FindBy(how = How.CSS, using = ".field-radio--solid.field-radio--checked p")
    private SelenideElement checkedFilterCategory;

    //Дропдаун сортировки
    @FindBy(how = How.CSS, using = ".dropdown__input")
    private SelenideElement catalogSort;

    //Кнопка Применить фильтр
    @FindBy(how = How.XPATH, using = ".//button[text()='Применить фильтр']")
    private SelenideElement confirmFilter;

    //Сортировка по популярности
    @FindBy(how = How.CSS, using = "label[for='popularity-up']")
    private SelenideElement popularitySort;

    //Сортировка по новизне
    @FindBy(how = How.CSS, using = "label[for='new-up']")
    private SelenideElement newSort;

    //Сортировка по цене по возрастанию
    @FindBy(how = How.CSS, using = "label[for='price_up']")
    private SelenideElement priceUpSort;

    //Сортировка по цене по убыванию
    @FindBy(how = How.CSS, using = "label[for='price-down']")
    private SelenideElement priceDownSort;

    //Все карточки товара на странице
    @FindBy(how = How.CSS, using = ".card")
    private ElementsCollection artCards;

    //Описание вставок первого элемента на выдаче
    @FindBy(css = ".card:first-child p:last-child")
    private SelenideElement firstArtDescription;

    //Лоадер на выдаче
    @FindBy(how = How.XPATH, using = ".//div[3]//span[@class='loader__spinner']")
    private SelenideElement loaderCatalog;

    //Лоадер на фильтрах
    @FindBy(how = How.XPATH, using = ".//div[2]//span[@class='loader__spinner']")
    private SelenideElement loaderFilter;

    //Фильтр Цена минимальное значение
    @FindBy(how = How.CSS, using = ".field-range__input-from")
    private SelenideElement filterPrice;

    //Заголовок фильтра
    @FindBy(xpath = "//span[text()='Вставка']")
    private SelenideElement spanInserts;

    //Заголовок фильтра
    @FindBy(xpath = "//span[text()='Цвет вставки']")
    private SelenideElement spanColoursInserts;

    //Заголовок фильтра
    @FindBy(xpath = "//span[text()='Повод']")
    private SelenideElement spanOccasion;

    //Коллекция активных чек-боксов фильтра Вставка
    @FindBy(xpath = "//div[5]//input[@class='field-checkbox__input'][not(@disabled)]")
    private ElementsCollection activeFilterInserts;

    //Коллекция активных чек-боксов фильтра Цвет вставки
    @FindBy(xpath = ".//div[6]//input[@class='field-checkbox__input'][not(@disabled)]")
    private ElementsCollection activeFilterColourOfInserts;

    //Коллекция активных чек-боксов фильтра Проект
    @FindBy(xpath = ".//div[7]//input[@class='field-checkbox__input'][not(@disabled)]")
    private ElementsCollection activeFilterProject;

    //Коллекция активных чек-боксов фильтра Повод
    @FindBy(xpath = ".//div[8]//input[@class='field-checkbox__input'][not(@disabled)]")
    private ElementsCollection activeFilterOccasion;

    //Все кнопки "Показать еще" для фильтров
    @FindBy(xpath = ".//button[@class='collapse__show-more']")
    private ElementsCollection buttonsShowMoreForFilters;

    //Переключение отображения характеристик на выдаче
    @FindBy(xpath = ".//button[text()='Подробно']")
    private SelenideElement viewWithInfo;

    //Переключение отображения характеристик на выдаче
    @FindBy(xpath = ".//button[text()='Кратко']")
    private SelenideElement viewWithoutInfo;

    //Коллекция лейблов Вставка
    @FindBy(xpath = ".//div[5]//label[@class='catalog-filter__list-item field-checkbox']")
    private ElementsCollection labelsInserts;

    //Первый активный бейджик ()
    @FindBy(css = ".apply-filter-item")
    private SelenideElement activeFilterWindowOnlyOne;

    //Кнопка "Подробнее" при наведении на карточку товара
    @FindBy(css = ".card__button")
    private SelenideElement hiddenButtonOnCard;

    //Кнопка "Показать еще"
    @FindBy(css = ".catalog-products__show-more")
    private SelenideElement buttonShowMore;

    //Input Поиска
    @FindBy(css = ".input-search__input")
    private SelenideElement inputSearch;

    //Лоудер Поиска
    @FindBy(css = ".header-descktop__search-wrapper .loader__spinner")
    private SelenideElement loaderSearch;

    //Кнопка все результаты поиска
    @FindBy(css = ".search-products-list__link-all")
    private SelenideElement showAllArtsAfterSearch;

    //Последняя крошка
    @FindBy(css = ".breadcrumbs__last-element")
    private SelenideElement lastBreadcrumb;

    //Нажатие на кнопку "Показать еще" и ожидание загрузки
    public void buttonShowMoreClick(int count){
        for (int i = 0; i < count; i++ ){
            buttonShowMore.click();
            loaderCatalogWaiting();
        }
    }
    public void goToTop(){
        executeJavaScript("window.scrollBy(0,-3000)", "");
        //$(byXpath(".//span[text()='breadcrumbs']")).scrollTo();
    }

    public void viewCatalogCheck(){
        artCards.get(1).$(byCssSelector(".card__description")).shouldNotBe(visible);
    }

    public void setViewWithoutInfoClick(){
        viewWithoutInfo.click();
    }

    public String getActiveFilterWindow(){
        return activeFilterWindowOnlyOne.scrollTo().getText();
    }

    public void clickAllButtonsShowMoreForFilters(){
        spanInserts.scrollTo();
        buttonsShowMoreForFilters.get(0).click();
        spanColoursInserts.scrollTo();
        buttonsShowMoreForFilters.get(1).click();
        spanOccasion.scrollTo();
        buttonsShowMoreForFilters.get(2).click();
    }

    //Выбор фильтра вставки
    public void choseCheckBoxFilterByRandom(){
        $(byXpath(".//h1")).scrollTo();
        labelsInserts.get((int) ((Math.random() * ( labelsInserts.size() - 0 )) + 0)).scrollTo().click();
        loaderFilterWaiting();
        confirmFilterClick();
        loaderCatalogWaiting();
    }

    //Получение вставок первого артикула на выдаче
    public String getInsertsOfFirstArt(){
        return artCards.get(0).find(byCssSelector("p:last-child")).scrollTo().getText();
    }

    //Получение текста первого активного фильтр-бейджика
    public String getTextOfFirstActiveFilter(){
        return activeFilterWindowOnlyOne.getText();
    }


    //Сортировка каталога по уменьшению цены
    public void priceDownSortClick() {
        catalogSort.click();
        priceDownSort.click();
    }

    //Сортировка каталога по увеличению цены
    public void priceUpSortClick() {
        catalogSort.click();
        priceUpSort.click();
    }

    //Ожидание загрузки артикулов
    public void cardsWaiting() {
        artCards.get(1).shouldBe(visible, Duration.ofMinutes(1));
    }

    //Ожидание загрузки лоудера на выдаче
    public void loaderCatalogWaiting() {
        loaderCatalog.shouldNotBe(visible, Duration.ofMinutes(1));
    }

    //Ожидание загрузки лоудера на фильтрах
    public void loaderFilterWaiting() {
        loaderFilter.shouldNotBe(visible, Duration.ofMinutes(1));
    }

    //Ожидание загрузки лоудера на поиска
    public void loaderSearchWaiting() {
        loaderSearch.shouldNotBe(visible, Duration.ofMinutes(1));
    }

    //Клик по "Применить фильтр"
    public void confirmFilterClick(){
        confirmFilter.click();
    }

    //Клик по id элемента в данный момент на выдаче
    public void artInCatalogClick(int i){
        artCards.get(i).find(byCssSelector("img")).click();
    }

    //Получение минимальной или максимальной цены изделия в каталоге (min или max)
    public String getMinMaxPrice(String value) {
        if (value == "min" || value == "max") {
            value = filterPrice.getAttribute(value);
        } else {
            Assert.fail("Метод принимает только min || max");
        }
        return value;
    }

    //Получение цены конкретного изделия
    public String getPriceOfArtOnCatalogPage(int i) {
        String price = artCards.get(i).find(".card__price").getText();
        price = price.replaceAll("[^0-9]", "");
        return price;
    }

    //Клик на элемент фильтра Категория
    public void choseFilterCategoryClick(int i) {
        $("h1").scrollTo();
        listFilterCategory.get(i).click();
        loaderFilterWaiting();
        confirmFilterClick();
        loaderCatalogWaiting();
    }

    //Передача наименования активного фильтра - 1 символ в конце строки 
    public String getActiveFilterName(){
        return  (checkedFilterCategory.getText().substring(0, checkedFilterCategory.getText().length() - 1));
    }

    //Наводка на карточку и нажатие на кнопку подробнее
    public void hoverAndClickToButton(SelenideElement card){
        card.hover();
        hiddenButtonOnCard.click();
    }

    //Возвращение конкретного артикула с выдачи (0 - 20)
    public SelenideElement getCurrentArtFromPage(int i){
        return artCards.get(i);
    }

    //вставка текста в поиск
    public void inputSearchSendKeys(String searchText){
        inputSearch.sendKeys(searchText);
    }

    //клик по всем результатам поиска
    public void showAllClick(){
        showAllArtsAfterSearch.click();
    }

    public String getTextOfLustBreadcrumb(){
        return lastBreadcrumb.getText();
    }

}
