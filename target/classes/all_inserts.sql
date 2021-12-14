INSERT INTO public.CATEGORY( ID, NAME, BREAKDOWN, UPPER_CATEGORY_ID)  VALUES (	1	,'Moda',	1	,	null	);
INSERT INTO public.CATEGORY( ID, NAME, BREAKDOWN, UPPER_CATEGORY_ID)  VALUES (	2	,'Elektronik',	1	,	null	);
INSERT INTO public.CATEGORY( ID, NAME, BREAKDOWN, UPPER_CATEGORY_ID)  VALUES (	3	,'Ev & Yaşam',	1	,	null	);
INSERT INTO public.CATEGORY( ID, NAME, BREAKDOWN, UPPER_CATEGORY_ID)  VALUES (	4	,'Elbise',	2	,	1	);
INSERT INTO public.CATEGORY( ID, NAME, BREAKDOWN, UPPER_CATEGORY_ID)  VALUES (	5	,'Gömlek',	2	,	1	);
INSERT INTO public.CATEGORY( ID, NAME, BREAKDOWN, UPPER_CATEGORY_ID)  VALUES (	6	,'Bilgisayar',	2	,	2	);
INSERT INTO public.CATEGORY( ID, NAME, BREAKDOWN, UPPER_CATEGORY_ID)  VALUES (	7	,'Dizüstü Bilgisayar',	3	,	6	);
INSERT INTO public.CATEGORY( ID, NAME, BREAKDOWN, UPPER_CATEGORY_ID)  VALUES (	8	,'Mobilya',	2	,	3	);
INSERT INTO public.CATEGORY( ID, NAME, BREAKDOWN, UPPER_CATEGORY_ID)  VALUES (	9	,'Sehpa',	3	,	8	);

INSERT INTO public.USERS ( ID, EMAIL, NAME, PHONE_NUMBER, SURNAME ) VALUES ( 1,'rsmciftci@gmail.com','Rasim','0541','Ciftci' );
INSERT INTO public.USERS ( ID, EMAIL, NAME, PHONE_NUMBER, SURNAME ) VALUES ( 2,'noname2@gmail.com','noname2','0542','nosurname2' );
INSERT INTO public.USERS ( ID, EMAIL, NAME, PHONE_NUMBER, SURNAME ) VALUES ( 3,'noname3@gmail.com','noname3','0543','nosurname3' );
INSERT INTO public.USERS ( ID, EMAIL, NAME, PHONE_NUMBER, SURNAME ) VALUES ( 4,'noname4@gmail.com','noname4','0544','nosurname4' );


INSERT INTO public.PRODUCT( ID, NAME, PRICE, REGISTRATION_DATE, CATEGORY_ID) VALUES (    1    ,'Mavi Elbise',    200    , now(),     4);
INSERT INTO public.PRODUCT( ID, NAME, PRICE, REGISTRATION_DATE, CATEGORY_ID) VALUES (    2    ,'Kırmızı Elbise',    300    , now(),     4);
INSERT INTO public.PRODUCT( ID, NAME, PRICE, REGISTRATION_DATE, CATEGORY_ID) VALUES (    3    ,'Mavi Gömlek',    500    , now(),     5);
INSERT INTO public.PRODUCT( ID, NAME, PRICE, REGISTRATION_DATE, CATEGORY_ID) VALUES (    4    ,'Sarı Gömlek',    450    , now(),     5);
INSERT INTO public.PRODUCT( ID, NAME, PRICE, REGISTRATION_DATE, CATEGORY_ID) VALUES (    5    ,'HP ',    15000    , now(),     7);
INSERT INTO public.PRODUCT( ID, NAME, PRICE, REGISTRATION_DATE, CATEGORY_ID) VALUES (    6    ,'MSI',    20000    , now(),     7);
INSERT INTO public.PRODUCT( ID, NAME, PRICE, REGISTRATION_DATE, CATEGORY_ID) VALUES (    7    ,'Orta Sehpa',    600    , now(),     9);


INSERT INTO public.PRODUCT_COMMENT ( ID, COMMENT, COMMENT_DATE, PRODUCT_ID, USER_ID ) VALUES ( 1, 'comment1', now(), 1 , 1 );
INSERT INTO public.PRODUCT_COMMENT ( ID, COMMENT, COMMENT_DATE, PRODUCT_ID, USER_ID ) VALUES ( 2, 'comment2', now(), 2 , 2 );
INSERT INTO public.PRODUCT_COMMENT ( ID, COMMENT, COMMENT_DATE, PRODUCT_ID, USER_ID ) VALUES ( 3, 'comment3', now(), 2 , 3 );
INSERT INTO public.PRODUCT_COMMENT ( ID, COMMENT, COMMENT_DATE, PRODUCT_ID, USER_ID ) VALUES ( 4, 'comment4', now(), 3 , 3 );
INSERT INTO public.PRODUCT_COMMENT ( ID, COMMENT, COMMENT_DATE, PRODUCT_ID, USER_ID ) VALUES ( 5, 'comment5', now(), 3 , 2 );
INSERT INTO public.PRODUCT_COMMENT ( ID, COMMENT, COMMENT_DATE, PRODUCT_ID, USER_ID ) VALUES ( 6, 'comment6', now(), 3 , 1 );