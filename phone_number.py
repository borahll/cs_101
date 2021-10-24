import phonenumbers
from phonenumbers import carrier , geocoder, timezone

mobileNo = input("enter phone numebr")
mobileNo = phonenumbers.parse(mobileNo)

print(timezone.time_zones_for_number(mobileNo))
print(carrier.name_for_number(mobileNo,"en"))
print(geocoder.description_for_number(mobileNo,"en"))
print("valid? ", phonenumbers.is_valid_number(mobileNo))
print("is it possible" , phonenumbers.is_possible_number(mobileNo))