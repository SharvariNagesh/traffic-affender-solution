
insert into Vehicle_Details (id,vehicle_no, owner_name, purchase_date,color,vehicle_make) values(2,'bcd','Nagesh',TO_DATE('01-06-2017','dd-MM-yyyy'),'black','WagonR');
insert into Vehicle_Details (id,vehicle_no, owner_name, purchase_date,color,vehicle_make) values(3,'cde','Hemanth',TO_DATE('10-2-2010','dd-MM-yyyy'),'black','WagonR');
insert into Vehicle_Details (id,vehicle_no, owner_name, purchase_date,color,vehicle_make) values(1,'abc','sharvari',TO_DATE('01-12-2019','dd-MM-yyyy'),'black','WagonR');
insert into Traffic_Affence (id, violation_code, violation_comment,violation_date,penalty_amount,violation_place,vehicle_details_id) values(1,'123','Signal light violation',TO_DATE('01-12-2020','dd-MM-yyyy'),500,'Bangalore',1);
insert into Traffic_Affence (id, violation_code, violation_comment,violation_date,penalty_amount,violation_place,vehicle_details_id) values(2,'123','Signal light violation',TO_DATE('01-12-2020','dd-MM-yyyy'),500,'Bangalore',2);


--  insert into Weathermusic  (id, weather, music) values(2,'cold','classic');
--  insert into Weathermusic  (id, weather, music) values(3,'cloudy','sad');
--    insert into Weathermusic  (id, weather, music) values(4,'hot','pop');
--    insert into Weathermusic  (id, weather, music) values(5,'cold','classic');
--    insert into Weathermusic  (id, weather, music) values(6,'cloudy','sad');