CREATE OR REPLACE FUNCTION CC_TRANSLATE (
   inValue       VARCHAR2)
   RETURN VARCHAR2
IS
   outValue VARCHAR2(200);
BEGIN
   outValue := upper(inValue);
   For x in (select value_in, value_out
          from CC_TRANSLATORS
  order by order_numb) loop
      outValue := replace(outValue, x.value_in, x.value_out);
   End Loop;
  RETURN outValue;
EXCEPTION
   WHEN NO_DATA_FOUND THEN
     RETURN null;
END;
/
