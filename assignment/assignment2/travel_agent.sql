PGDMP                         w            travel    9.6.15    9.6.15     X           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            Y           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            Z           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            [           1262    16431    travel    DATABASE     �   CREATE DATABASE travel WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
    DROP DATABASE travel;
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            \           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12387    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            ]           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    16445    booking    TABLE     �   CREATE TABLE public.booking (
    id integer NOT NULL,
    customer_id integer,
    holiday_package_id integer,
    booking_time date,
    depature_date date,
    return_date date
);
    DROP TABLE public.booking;
       public         postgres    false    3            �            1259    16440    customer    TABLE     �   CREATE TABLE public.customer (
    id integer NOT NULL,
    name character varying(50),
    email character varying(50),
    phone_number character varying(12),
    address character varying(100)
);
    DROP TABLE public.customer;
       public         postgres    false    3            �            1259    16432    holiday_package    TABLE     �   CREATE TABLE public.holiday_package (
    id integer NOT NULL,
    type character varying(30),
    destination character varying(50),
    cost numeric,
    duration integer
);
 #   DROP TABLE public.holiday_package;
       public         postgres    false    3            U          0    16445    booking 
   TABLE DATA               p   COPY public.booking (id, customer_id, holiday_package_id, booking_time, depature_date, return_date) FROM stdin;
    public       postgres    false    187   �       T          0    16440    customer 
   TABLE DATA               J   COPY public.customer (id, name, email, phone_number, address) FROM stdin;
    public       postgres    false    186   �       S          0    16432    holiday_package 
   TABLE DATA               P   COPY public.holiday_package (id, type, destination, cost, duration) FROM stdin;
    public       postgres    false    185   �       �           2606    16449    booking booking_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.booking
    ADD CONSTRAINT booking_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.booking DROP CONSTRAINT booking_pkey;
       public         postgres    false    187    187            �           2606    16444    customer customer_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.customer
    ADD CONSTRAINT customer_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.customer DROP CONSTRAINT customer_pkey;
       public         postgres    false    186    186            �           2606    16439 $   holiday_package holiday_package_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.holiday_package
    ADD CONSTRAINT holiday_package_pkey PRIMARY KEY (id);
 N   ALTER TABLE ONLY public.holiday_package DROP CONSTRAINT holiday_package_pkey;
       public         postgres    false    185    185            U   V   x�u��� �s�K�|(4�t�9 Uj8�|��'EIGL4X�Ͳ��c'�������5o�G���=v�̆i|U���ʧR� t�(�      T   �   x�]��N�0Eׯ_��Biiw�ɸ0M�č��L�@�����eb��z������	��a�/BG`#^~I�uҘ/pm��ԪT�8�t�g���������<f����<�x���І�Z��y��3��	x#/y��'�N��⿪������:UwԆ6xVAf�v=^q���ا��-E%U���f��B�36k�-�0�q����F���Et$�+�t����u`�'��uS�Tixa���f�{����xs      S   Y   x�3�,H��tJ���44� N.#΂Ԣ��<��)\��:83/=� �(��*c�e�	�H��I�K�4�K��%|�s���&q��qqq �/:     