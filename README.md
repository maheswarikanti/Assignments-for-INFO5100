# Assignments-for-INFO5100
Assignment for class 1
1. Buy a camera from Amazon

Consumer
Data: Name, address, Phone, userid, password
Behaviour: Buy, serach, compare, return, cancel, review

Amazon
Data: URL, cameras, account
Behaviour: search, sort, compare, order

Camera
Data: price, color, brand, model, memory

Credit card:
Data: number,name,exipry date, cvv, company

ToBuyCameraOnAmazon

Consumer Mahi,
Website Amazon,
Product Laptop,
CreditCArd card
CreditCardCompany visa
OrderConfirmed response

mahi.LoginToAmazonAccount:authorise

If(authorise is true)
             mahi.goTosearchtab->question:searchforLaptop

             mahiSortsBasedOn->PriceRange,brand,color,memory.

Loop 
    UntilDesiredCAmeraIsFoundInThePage->website
       If mahi.findsDesiredItemInPage->addToCart

        else
         goToNextPage->Pagenumber=Pagenumber+1
 end

SelectPaymentMethod
SelectDeliveryAddress

If(payment method available)

SelectPAymentMethod=CreditCard

else

AddNewPaymentMethod

end

else

SignInAsNewUser

end
